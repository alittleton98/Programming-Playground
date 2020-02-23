from datetime import datetime
from flaskDemo import db

class Course(db.Model):
   __tablename__ = 'course'
   courseID = db.Column(db.String(8), primary_key=True)
   courseName = db.Column(db.String(15))
#db.Model.metadata.reflect(db.engine)


class Student(db.Model):
    __tablename__='student'
    studentID = db.Column(db.Integer, primary_key=True)
    studentName = db.Column(db.String(25))
    
class Faculty(db.Model):
    __tablename__='faculty'
    facultyID = db.Column(db.Integer, primary_key=True)
    facultyName = db.Column(db.String(25))
    
class Qualified(db.Model):
    courseID = db.Column(db.String(8), db.ForeignKey('course.courseID'),primary_key=True)
    facultyID = db.Column(db.Integer, db.ForeignKey('faculty.facultyID'),primary_key=True)
    Datequalified = db.Column(db.DateTime)
class Section(db.Model):
   sectionNo=db.Column(db.Integer, primary_key=True)
   Semester=db.Column(db.String(5))
   courseID = db.Column(db.String(8), db.ForeignKey('course.courseID'))

class Registration(db.Model):
   studentID = db.Column(db.Integer, primary_key=True)
   sectionNo = db.Column(db.Integer, db.ForeignKey('section.sectionNo'), primary_key=True)
   Semester = db.Column(db.String(5), primary_key=True)
   courseID = db.Column(db.String(8), db.ForeignKey('course.courseID'))
   
class User(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(20), unique=True, nullable=False)
    email = db.Column(db.String(120), unique=True, nullable=False)
    image_file = db.Column(db.String(20), nullable=False, default='default.jpg')
    password = db.Column(db.String(60), nullable=False)
    posts = db.relationship('Post', backref='author', lazy=True)

    def __repr__(self):
        return f"User('{self.username}', '{self.email}', '{self.image_file}')"


class Post(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(100), nullable=False)
    date_posted = db.Column(db.DateTime, nullable=False, default=datetime.utcnow)
    content = db.Column(db.Text, nullable=False)
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'), nullable=False)

    def __repr__(self):
        return f"Post('{self.title}', '{self.date_posted}')"
