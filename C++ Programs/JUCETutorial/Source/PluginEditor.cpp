/*
  ==============================================================================

    This file contains the basic framework code for a JUCE plugin editor.

  ==============================================================================
*/

#include "PluginProcessor.h"
#include "PluginEditor.h"

//==============================================================================
JUCETutorialAudioProcessorEditor::JUCETutorialAudioProcessorEditor (JUCETutorialAudioProcessor& p)
    : AudioProcessorEditor (&p), audioProcessor (p)
{
    // Make sure that before the constructor has finished, you've set the
    // editor's size to whatever you need it to be.
    setSize (200, 200);

    MidiVolume.setSliderStyle(juce::Slider::LinearBarVertical);
    MidiVolume.setRange(0.0, 127.0, 1.0);
    MidiVolume.setTextBoxStyle(juce::Slider::NoTextBox, false, 90, 0);
    MidiVolume.setPopupDisplayEnabled(true, false, this);
    MidiVolume.setTextValueSuffix(" Volume");
    MidiVolume.setValue(1.0);
    MidiVolume.addListener(this);

    addAndMakeVisible(&MidiVolume);
}

JUCETutorialAudioProcessorEditor::~JUCETutorialAudioProcessorEditor()
{
}

//==============================================================================
void JUCETutorialAudioProcessorEditor::paint (juce::Graphics& g)
{
    // (Our component is opaque, so we must completely fill the background with a solid colour)
    g.fillAll (getLookAndFeel().findColour (juce::ResizableWindow::backgroundColourId));

    g.setColour (juce::Colours::white);
    g.setFont (15.0f);
    g.drawFittedText ("Midi Volume", getLocalBounds(), juce::Justification::centred, 1);
}

void JUCETutorialAudioProcessorEditor::resized()
{
    // This is generally where you'll want to lay out the positions of any
    // subcomponents in your editor..

    //X, Y, Width, Height
    MidiVolume.setBounds(40, 30, 20, getHeight() - 60);
}
void JUCETutorialAudioProcessorEditor::sliderValueChanged(juce::Slider* slider)
{
    audioProcessor.noteOnVel = MidiVolume.getValue();
}

