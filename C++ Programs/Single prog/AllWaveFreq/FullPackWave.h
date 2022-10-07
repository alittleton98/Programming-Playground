// Program is meant to test file sizes for fully packed wav files
// "Fully Packed" = data is present for samples over a variety of sample rates
// i.e. 4 48kHz tracks can fit in 1 192kHz file when read in groups

#pragma once

#include <iostream>
#include <fstream>

#define ThirtyTwoBitFloatMax 1
#define ThirtyTwoBitFloatMin -1
#define TwentyFourBitIntMax 1677215
#define TwentyFourBitIntMin 0

using std::string;
using std::fstream;

class FullPackWave
{
    typedef struct  WAV_HEADER
    {
        /* RIFF Chunk Descriptor */
        uint8_t         RIFF[4];        // RIFF Header Magic header
        uint32_t        ChunkSize;      // RIFF Chunk Size
        uint8_t         WAVE[4];        // WAVE Header
        /* "fmt" sub-chunk */
        uint8_t         fmt[4];         // FMT header
        uint32_t        Subchunk1Size;  // Size of the fmt chunk
        uint16_t        AudioFormat;    // Audio format 1=PCM,6=mulaw,7=alaw,     257=IBM Mu-Law, 258=IBM A-Law, 259=ADPCM
        uint16_t        NumberOfPackedTracks;
        uint16_t        NumOfChan;      // Number of channels 1=Mono 2=Stereo
        uint32_t        FileSamplesPerSec;  // Sampling Frequency in Hz
        //uint32_t        TrackSamplesPerSec = FileSamplesPerSec/NumberOfPackedTracks;
        uint32_t        bytesPerSec;    // bytes per second
        uint16_t        blockAlign;     // 2=16-bit mono, 4=16-bit stereo
        uint16_t        bitsPerSample;  // Number of bits per sample
        /* "data" sub-chunk */
        uint8_t         Subchunk2ID[4]; // "data"  string
        uint32_t        Subchunk2Size;  // Sampled data length
    } wav_hdr;

    // mono data
    uint32_t audioData;

    // stereo data
    float leftData;
    float rightData;

    // first order ambx data
    float XData;
    float YData;
    float ZData;
    float WData;
    

    void WriteHeader(FILE* output)
    {
        
    }

    // cast 32 bit float to char* 
    void WriteMonoData(FILE* output)
    {

    }

    void WriteStereoData() 
    {

    }

    void WriteAmbxData()
    {

    }
};

int main() 
{
    std::ofstream file("D:\\Users\\Mordecai\\Dev\\Research\\DataDump\\WavePack2.wav", std::ofstream::binary);
    //uint32_t number = 35684920;
    //file.write((char*)number, sizeof(number));
    char* buffer = new char[256];
    buffer[0] = 7;
    buffer[1] = 3;
    file.write(buffer, 256);
}

