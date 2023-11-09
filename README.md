# popl-python-parser

`Nathaniel Rupp (ncrnkw)`

This project will parse Python files according to the specifications laid out in the assignment document.

## Requirements

- Python 3

## Project Setup

1. Activate the virtual environment

   - On MacOS, the command is `source env/bin/activate`
   - May be something different based on OS

2. Install the dependencies

   - `pip install -r requirements.txt`

3. Run the program
   - `python3 main.py ./testcases/deliv<x>.py`
   - Replace `<x>` with the deliverable that is being tested.

---

### Additional

Rebuild the antlr files with `antlr4 -Dlanguage=Python3 python.g4`
