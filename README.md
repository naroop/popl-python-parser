# popl-python-parser

`Nathaniel Rupp (ncrnkw)`

#### [GitHub Link](https://github.com/naroop/popl-python-parser)

#### [Demo Video Link](https://youtu.be/QMGLosXGitA)

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

   - `python3 main.py ./testcases/project_deliverable_<n>_testcase.py`
      - Replace `<n>` with the deliverable that is being tested
      - This will print the stringified tree
   - `antlr4-parse python.g4 start -tree -gui ./testcases/project_deliverable_<n>_testcase.py`
      - Replace `<n>` with the deliverable that is being tested
      - This will open a GUI with the visualized parse tree

---

### Additional

If needed, rebuild the antlr files with `antlr4 -Dlanguage=Python3 python.g4`
