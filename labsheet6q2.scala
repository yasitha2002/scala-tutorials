package Demo

object labsheet6q2 {
  def main(args: Array[String]): Unit = {

  }
  def validateInput(name: String, mark: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (mark < 0 || totalMarks <= 0 || mark > totalMarks) {
      (false, Some("Marks should be a positive integer and not exceed total possible marks"))
    } else {
      (true, None)
    }
  }

  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    var validInput = false
    var studentRecord: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'F')

    while (!validInput) {
      val name = scala.io.StdIn.readLine("Enter the Name : ")

      print("Enter the Mark : ")
      val mark= scala.io.StdIn.readInt()

      print("Enter total possible marks: ")
      val totalMarks = scala.io.StdIn.readInt()

      val (isValid, errorMessage) = validateInput(name, mark, totalMarks)

      if (isValid) {
        val percentage = (mark.toDouble / totalMarks) * 100
        val grade = percentage match {
          case p if p >= 90 => 'A'
          case p if p >= 75 => 'B'
          case p if p >= 50 => 'C'
          case _ => 'D'
        }
        studentRecord = (name, mark, totalMarks, percentage, grade)
        validInput = true
      }

      else {
        println(errorMessage.getOrElse("Invalid input, please try again."))
      }
    }

    studentRecord
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }


  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    getStudentInfo()
  }


    println("Student Record Management System")


    val studentRecord = getStudentInfoWithRetry()

    printStudentRecord(studentRecord)
  }
