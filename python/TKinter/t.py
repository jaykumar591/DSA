import tkinter as tk
from tkinter import messagebox

def show_input():
    user_input = entry.get()
    messagebox.showinfo("Your Input", f"You entered: {user_input}")

# Create the main window
top = tk.Tk()
top.title("Input Example")

# Create a label
label = tk.Label(top, text="Enter something:")
label.pack(pady=5)

# Create an entry widget
entry = tk.Entry(top, width=30)
entry.pack(pady=5)

# Create a button that triggers the show_input function
button = tk.Button(top, text="Submit", command=show_input)
button.pack(pady=5)

# Run the application
top.mainloop()
