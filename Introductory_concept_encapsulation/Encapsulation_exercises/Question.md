Exercise: “StudentRecord” class
Requirements
Class & Fields

    Create a class named StudentRecord.

    It must have three private fields:

        String studentId

        String studentName

        List<Integer> grades

Constructor

    A public constructor that takes studentId and studentName.

    Inside, initialize grades as an empty ArrayList.

Getters & Setters

    Getter for studentId (no setter—IDs shouldn’t change once set).

    Getter and setter for studentName. The setter should throw an IllegalArgumentException if the name is null or blank.

    Getter for grades that returns an unmodifiable view (so external code can’t add or remove directly).

Behavioral methods

    public void addGrade(int grade)

        Validates grade is between 0 and 100 (inclusive); if not, throw an IllegalArgumentException.

        Otherwise, adds it to your internal grades list.

        public double getAverage()

        Computes and returns the average of all grades (or 0.0 if there are none).

public int getHighestGrade()

    Returns the maximum grade (or -1 if there are none).

Override

    public String toString()

Return a string like

    StudentRecord[id=12345, name=Alice, grades=[85, 92, 78], avg=85.0]

Test it

In a separate Main class (or in StudentRecord with a main), create a few StudentRecord instances, call your methods, and print results to verify encapsulation (e.g. try to mutate the returned grades list and confirm it fails).
