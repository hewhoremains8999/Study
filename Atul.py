class Student:
    def __init__(self, roll_no, name, marks):
        self.roll_no = roll_no
        self.name = name
        self.marks = marks

    def display(self):
        print(f"Roll No: {self.roll_no}")
        print(f"Name: {self.name}")
        print(f"Marks: {self.marks}\n")

    def update_marks(self, new_marks):
        self.marks = new_marks


# Create Student objects
s1 = Student(101, "Aarav", 89.5)
s2 = Student(102, "Siya", 92.3)

# Display details
s1.display()
s2.display()

# Update marks
s1.update_marks(95)

print("After updating marks:")
s1.display()
