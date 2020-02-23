from flask import Flask
app = Flask(_name_)


@app.route('/')
def helloWorld():
    return 'hello, world'
