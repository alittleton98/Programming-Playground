from flask import Flask
app = Flask(__name__)

@app.route('/')

def hello():
    return ('hello  folder world ') + ', '.join(str(4**i) for i in range(5))
