from flaskDemo import app   #app must be defined in the flaskDemo project.
# The presence of an __init.py__folder identifies that flaskDemo is a project.
# app is, in fact, present in the __init.py__ folder for the flaskDemo project

if __name__ == '__main__':
    app.run(debug=True)
