/*
* GradeCalculation.java
* Author: Bhargav Devana
* Submission Date: TBD
*
* Purpose: The purpose of this program is to calculate your letter grade
* in CSCI 1301-1301L by inputting any combination for scores and their weights.
* The program also tells you if you can get the grade you want or how much
* your average for the remaining assignments need to be.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
CSCI 1301: Project 1 Page 3
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

import java.util.Scanner;
public class GradeCalculation {
	
	static int A = 90;
	static int B = 80;
	static int C = 70;
	static int D = 60;
	static int F = 0;
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String gradeEntered, gradeEarned, exam1Answer, exam2Answer,
		examFinalAnswer, labAnswer, projectAnswer, quizAnswer, attendanceAnswer;
		int  weight1, weight2, weightFinal, weightLab, weightProject,
		weightAttendance, weightQuiz, exam2=0, exam1=0, examFinal=0, 
		labAverage=0, projectAverage=0, attendanceAverage=0, quizAverage=0, finalOverallScore;
		float currentScorenum, currentScoreden;
		double currentScore;
		
		
	
		
		System.out.println("Grading Scale:");
		System.out.println("A    90 - 100");
		System.out.println("B    80 - 89");
		System.out.println("C    70 - 79");
		System.out.println("D    60 - 69");
		System.out.println("F    below 60");
		System.out.print("What letter grade do you want to achieve for the course? ");
		gradeEntered = keyboard.next();
		gradeEntered = gradeEntered.toUpperCase();
		if (gradeEntered.equals("A") || (gradeEntered.equals("B")) || gradeEntered.equals("C")
			|| (gradeEntered.equals("D")) || (gradeEntered.equals("F")))
		{
			System.out.println("Enter Percentage Weights:");
		}
		else
		{
			System.out.println("Input Error");
			System.exit(0);
		}
		
		System.out.print("Exam 1:         ");
		weight1 = keyboard.nextInt();
		System.out.print("Exam 2:         ");
		weight2 = keyboard.nextInt();
		System.out.print("Final Exam:     ");
		weightFinal = keyboard.nextInt();
		System.out.print("Labs:           ");
		weightLab = keyboard.nextInt();
		System.out.print("Projects:       ");
		weightProject = keyboard.nextInt();
		System.out.print("Attendance:     ");
		weightAttendance = keyboard.nextInt();
		System.out.print("Quizzes:        ");
		weightQuiz = keyboard.nextInt();
		
		if ((weight1 + weight2 + weightFinal + weightLab + 
			weightProject + weightAttendance + weightQuiz) != 100)
		{
			System.out.println("Weights don't add up to 100, program exiting...");
			System.exit(0);
		}
		else
		{
			System.out.println("Enter your scores out of a 100:");
		}
		System.out.print("Do you know your Exam 1 score? ");
		exam1Answer = keyboard.next();
		exam1Answer = exam1Answer.toUpperCase();
		
		if ((exam1Answer.equals("YES")) || (exam1Answer.equals("Y")))
		{
			System.out.print("Score received on exam 1: ");
			exam1 = keyboard.nextInt();
			System.out.print("Do you know your Exam 2 score? ");
			exam2Answer = keyboard.next();
			exam2Answer = exam2Answer.toUpperCase();
			if ((exam2Answer.equals("YES")) || (exam2Answer.equals("Y")))
			{
				System.out.print("Score received on exam 2: ");
				exam2 = keyboard.nextInt();
				System.out.print("Do you know your Final Exam score? ");
				examFinalAnswer = keyboard.next();
				examFinalAnswer = examFinalAnswer.toUpperCase();
				if ((examFinalAnswer.equals("YES")) || 
					(examFinalAnswer.equals("Y")))
				{
					System.out.print("Score received on final exam: ");
					examFinal = keyboard.nextInt();
					System.out.print("Do you know your lab average? ");
					labAnswer = keyboard.next();
					labAnswer = labAnswer.toUpperCase();
					if ((labAnswer.equals("YES")) || (labAnswer.equals("Y")))
					{
						System.out.print("Average Lab Grade: ");
						labAverage = keyboard.nextInt();
						System.out.print("Do you know your project average? ");
						projectAnswer = keyboard.next();
						projectAnswer = projectAnswer.toUpperCase();
						if((projectAnswer.equals("YES")) || (projectAnswer.equals("Y")))
						{
							System.out.print("Average Project Grade: ");
							projectAverage = keyboard.nextInt();
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)+(weightLab*labAverage)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weight2+weightFinal+weightLab
											+weightProject+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //all scores. ending 1
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)+(weightLab*labAverage)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage);
									currentScoreden = (weight1+weight2+weightFinal+weightLab
											+weightProject+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance. ending 2
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)+(weightLab*labAverage)
											+(weightProject*projectAverage)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weight2+weightFinal+weightLab
											+weightProject+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz. ending 3
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)+(weightLab*labAverage)
											+(weightProject*projectAverage));
									currentScoreden = (weight1+weight2+weightFinal+weightLab
											+weightProject);
									currentScore = currentScorenum/currentScoreden; //no quiz and attendance. ending 4
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
						else
						{
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)+(weightLab*labAverage)
											+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weight2+weightFinal+weightLab
											+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no project. ending 5
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)+(weightLab*labAverage)
											+(weightQuiz)
											*quizAverage);
									currentScoreden = (weight1+weight2+weightFinal+weightLab
											+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance and project. ending 6
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)+(weightLab*labAverage)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weight2+weightFinal+weightLab
											+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz and project. ending 7
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)+(weightLab*labAverage));
									currentScoreden = (weight1+weight2+weightFinal+weightLab);
									currentScore = currentScorenum/currentScoreden; //no attendance, quiz, and project. ending 8
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
					}
					else //else for lab
					{
						System.out.print("Do you know your project average? ");
						projectAnswer = keyboard.next();
						projectAnswer = projectAnswer.toUpperCase();
						if((projectAnswer.equals("YES")) || (projectAnswer.equals("Y")))
						{
							System.out.print("Average Project Grade: ");
							projectAverage = keyboard.nextInt();
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)+
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weight2+weightFinal
											+weightProject+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no lab. ending 9
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage);
									currentScoreden = (weight1+weight2+weightFinal
											+weightProject+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance and lab. ending 10
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)
											+(weightProject*projectAverage)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weight2+weightFinal
											+weightProject+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz and lab. ending 11
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)
											+(weightProject*projectAverage));
									currentScoreden = (weight1+weight2+weightFinal
											+weightProject);
									currentScore = currentScorenum/currentScoreden; //no quiz, attendance, and lab. ending 12
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
						else
						{
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)
											+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weight2+weightFinal
											+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no project and lab. ending 13
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)
											+(weightQuiz)
											*quizAverage);
									currentScoreden = (weight1+weight2+weightFinal
											+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance, project, and lab. ending 14
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weight2+weightFinal
											+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz, project, and lab. ending 15
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightFinal*examFinal));
									currentScoreden = (weight1+weight2+weightFinal);
									currentScore = currentScorenum/currentScoreden; //no attendance, quiz, project, and lab. ending 16
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
					}
				}
				else //else for final exam
				{
					System.out.print("Do you know your lab average? ");
					labAnswer = keyboard.next();
					labAnswer = labAnswer.toUpperCase();
					if ((labAnswer.equals("YES")) || (labAnswer.equals("Y")))
					{
						System.out.print("Average Lab Grade: ");
						labAverage = keyboard.nextInt();
						System.out.print("Do you know your project average? ");
						projectAnswer = keyboard.next();
						projectAnswer = projectAnswer.toUpperCase();
						if((projectAnswer.equals("YES")) || (projectAnswer.equals("Y")))
						{
							System.out.print("Average Project Grade: ");
							projectAverage = keyboard.nextInt();
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightLab*labAverage)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weight2+weightLab
											+weightProject+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no final exam. ending 17
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightLab*labAverage)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage);
									currentScoreden = (weight1+weight2+weightLab
											+weightProject+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance and final exam. ending 18
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightLab*labAverage)
											+(weightProject*projectAverage)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weight2+weightLab
											+weightProject+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz and final exam. ending 19
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightLab*labAverage)
											+(weightProject*projectAverage));
									currentScoreden = (weight1+weight2+weightLab
											+weightProject);
									currentScore = currentScorenum/currentScoreden; //no quiz, attendance, and final exam. ending 20
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
						else
						{
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightLab*labAverage)
											+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weight2+weightLab
											+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no project and final. ending 21
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightLab*labAverage)
											+(weightQuiz)
											*quizAverage);
									currentScoreden = (weight1+weight2+weightLab
											+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance, project, and final. ending 22
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightLab*labAverage)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weight2+weightLab
											+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz, project, and final exam. ending 23
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightLab*labAverage));
									currentScoreden = (weight1+weight2+weightLab);
									currentScore = currentScorenum/currentScoreden; //no attendance, quiz, and project. ending 24
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
					}
					else //else for lab
					{
						System.out.print("Do you know your project average? ");
						projectAnswer = keyboard.next();
						projectAnswer = projectAnswer.toUpperCase();
						if((projectAnswer.equals("YES")) || (projectAnswer.equals("Y")))
						{
							System.out.print("Average Project Grade: ");
							projectAverage = keyboard.nextInt();
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weight2
											+weightProject+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no lab and final. ending 25
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage);
									currentScoreden = (weight1+weight2
											+weightProject+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance, lab, and final. ending 26
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightProject*projectAverage)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weight2
											+weightProject+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz, lab, and final. ending 27
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightProject*projectAverage));
									currentScoreden = (weight1+weight2
											+weightProject);
									currentScore = currentScorenum/currentScoreden; //no quiz, attendance,lab, and final. ending 28
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
						else
						{
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weight2
											+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no project, lab, and final. ending 29
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightQuiz)
											*quizAverage);
									currentScoreden = (weight1+weight2+weightFinal
											+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance, project, lab, and final. ending 30
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weight2*exam2)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weight2+weightFinal
											+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz, project, lab, and final. ending 31
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weight2*exam2));
									currentScoreden = (weight1+weight2+weightFinal);
									currentScore = currentScorenum/currentScoreden; //no attendance, quiz, project, lab, and final. ending 12
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
					}
				}
			}
			else //else for exam 2 starts here
			{
				{
					System.out.print("Do you know your lab average? ");
					labAnswer = keyboard.next();
					labAnswer = labAnswer.toUpperCase();
					if ((labAnswer.equals("YES")) || (labAnswer.equals("Y")))
					{
						System.out.print("Average Lab Grade: ");
						labAverage = keyboard.nextInt();
						System.out.print("Do you know your project average? ");
						projectAnswer = keyboard.next();
						projectAnswer = projectAnswer.toUpperCase();
						if((projectAnswer.equals("YES")) || (projectAnswer.equals("Y")))
						{
							System.out.print("Average Project Grade: ");
							projectAverage = keyboard.nextInt();
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)
											+(weightLab*labAverage)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weightLab
											+weightProject+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no final exam and exam 2. ending 33
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)
											+(weightLab*labAverage)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage);
									currentScoreden = (weight1+weightLab
											+weightProject+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance, final exam, and exam 2. ending 34
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)
											+(weightLab*labAverage)
											+(weightProject*projectAverage)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weightLab
											+weightProject+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz, final exam, and exam 2. ending 35
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)
											+(weightLab*labAverage)
											+(weightProject*projectAverage));
									currentScoreden = (weight1+weightLab
											+weightProject);
									currentScore = currentScorenum/currentScoreden; //no quiz, attendance, final exam, and exam 2. ending 36
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
						else
						{
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weightLab*labAverage)+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weightLab
											+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no project, final, and exam 2. ending 37
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weightLab*labAverage)+(weightQuiz)
									*quizAverage);
									currentScoreden = (weight1+weightLab+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance, project, final, and exam 2. ending 38
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weightLab*labAverage)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weightLab
											+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz, project, final exam, and exam 2. ending 39
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weightLab*labAverage));
									currentScoreden = (weight1+weight2+weightLab);
									currentScore = currentScorenum/currentScoreden; //no attendance, quiz, project, and exam 2. ending 40
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
					}
					else //else for lab
					{
						System.out.print("Do you know your project average? ");
						projectAnswer = keyboard.next();
						projectAnswer = projectAnswer.toUpperCase();
						if((projectAnswer.equals("YES")) || (projectAnswer.equals("Y")))
						{
							System.out.print("Average Project Grade: ");
							projectAverage = keyboard.nextInt();
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weightProject+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no lab, final, and exam 2. ending 41
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)
											+(weightProject*projectAverage)+(weightQuiz)
											*quizAverage);
									currentScoreden = (weight1+weightProject+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance, lab, final, and exam 2. ending 42
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)
											+(weightProject*projectAverage)
											+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weightProject+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz, lab, final, and exam 2. ending 43
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)
											+(weightProject*projectAverage));
									currentScoreden = (weight1+weightProject);
									currentScore = currentScorenum/currentScoreden; //no quiz, attendance,lab, final, and exam 2. ending 44
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
						else
						{
							System.out.print("Do you know your quiz average? ");
							quizAnswer = keyboard.next();
							quizAnswer = quizAnswer.toUpperCase();
							if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
							{
								System.out.print("Average Quiz Grade: ");
								quizAverage = keyboard.nextInt();
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weightQuiz)
									*quizAverage)+(weightAttendance*attendanceAverage);
									currentScoreden = (weight1+weightQuiz+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no project, lab, final, and exam 2. ending 45
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1)+(weightQuiz)*quizAverage);
									currentScoreden = (weight1+weightQuiz);
									currentScore = currentScorenum/currentScoreden; //no attendance, project, lab, final, and exam 2. ending 46
									System.out.println("Current Grade Score: " + currentScore);
								}
							
							}
							else
							{
								System.out.print("Do you know your attendance average? ");
								attendanceAnswer = keyboard.next();
								attendanceAnswer = attendanceAnswer.toUpperCase();
								if ((attendanceAnswer.equals("YES")) ||
									(attendanceAnswer.equals("Y")))
								{
									System.out.print("Average Attendance Grade: ");
									attendanceAverage = keyboard.nextInt();
									currentScorenum = ((weight1*exam1)+(weightAttendance*attendanceAverage));
									currentScoreden = (weight1+weightAttendance);
									currentScore = currentScorenum/currentScoreden; //no quiz, project, lab, final, and exam 2. ending 47
									System.out.println("Current Grade Score: " + currentScore);
								}
								else
								{
									currentScorenum = ((weight1*exam1));
									currentScoreden = (weight1);
									currentScore = currentScorenum/currentScoreden; //no attendance, quiz, project, lab, final, and exam2. ending 48
									System.out.println("Current Grade Score: " + currentScore);
								}
							}
						}
					}
				}
			}
		}
		else //else for exam 1 starts here
		{
			{
				System.out.print("Do you know your lab average? ");
				labAnswer = keyboard.next();
				labAnswer = labAnswer.toUpperCase();
				if ((labAnswer.equals("YES")) || (labAnswer.equals("Y")))
				{
					System.out.print("Average Lab Grade: ");
					labAverage = keyboard.nextInt();
					System.out.print("Do you know your project average? ");
					projectAnswer = keyboard.next();
					projectAnswer = projectAnswer.toUpperCase();
					if((projectAnswer.equals("YES")) || (projectAnswer.equals("Y")))
					{
						System.out.print("Average Project Grade: ");
						projectAverage = keyboard.nextInt();
						System.out.print("Do you know your quiz average? ");
						quizAnswer = keyboard.next();
						quizAnswer = quizAnswer.toUpperCase();
						if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
						{
							System.out.print("Average Quiz Grade: ");
							quizAverage = keyboard.nextInt();
							System.out.print("Do you know your attendance average? ");
							attendanceAnswer = keyboard.next();
							attendanceAnswer = attendanceAnswer.toUpperCase();
							if ((attendanceAnswer.equals("YES")) ||
								(attendanceAnswer.equals("Y")))
							{
								System.out.print("Average Attendance Grade: ");
								attendanceAverage = keyboard.nextInt();
								currentScorenum = ((weightLab*labAverage)
										+(weightProject*projectAverage)+(weightQuiz)
										*quizAverage)+(weightAttendance*attendanceAverage);
								currentScoreden = (weightLab+weightProject+weightQuiz+weightAttendance);
								currentScore = currentScorenum/currentScoreden; //no final exam, exam 2, and exam 1. ending 49
								System.out.println("Current Grade Score: " + currentScore);
							}
							else
							{
								currentScorenum = ((weightLab*labAverage)
								+(weightProject*projectAverage)+(weightQuiz)*quizAverage);
								currentScoreden = (weightLab+weightProject+weightQuiz);
								currentScore = currentScorenum/currentScoreden; //no attendance, final exam, and exam 2, and exam 1. ending 50
								System.out.println("Current Grade Score: " + currentScore);
							}
						
						}
						else
						{
							System.out.print("Do you know your attendance average? ");
							attendanceAnswer = keyboard.next();
							attendanceAnswer = attendanceAnswer.toUpperCase();
							if ((attendanceAnswer.equals("YES")) ||
								(attendanceAnswer.equals("Y")))
							{
								System.out.print("Average Attendance Grade: ");
								attendanceAverage = keyboard.nextInt();
								currentScorenum = ((weightLab*labAverage)
								+(weightProject*projectAverage)
								+(weightAttendance*attendanceAverage));
								currentScoreden = (weightLab+weightProject+weightAttendance);
								currentScore = currentScorenum/currentScoreden; //no quiz, final exam, exam 2, and exam 1. ending 51
								System.out.println("Current Grade Score: " + currentScore);
							}
							else
							{
								currentScorenum = ((weightLab*labAverage)
								+(weightProject*projectAverage));
								currentScoreden = (weightLab+weightProject);
								currentScore = currentScorenum/currentScoreden; //no quiz, attendance, final exam, exam 2, and exam 1. ending 52
								System.out.println("Current Grade Score: " + currentScore);
							}
						}
					}
					else
					{
						System.out.print("Do you know your quiz average? ");
						quizAnswer = keyboard.next();
						quizAnswer = quizAnswer.toUpperCase();
						if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
						{
							System.out.print("Average Quiz Grade: ");
							quizAverage = keyboard.nextInt();
							System.out.print("Do you know your attendance average? ");
							attendanceAnswer = keyboard.next();
							attendanceAnswer = attendanceAnswer.toUpperCase();
							if ((attendanceAnswer.equals("YES")) ||
								(attendanceAnswer.equals("Y")))
							{
								System.out.print("Average Attendance Grade: ");
								attendanceAverage = keyboard.nextInt();
								currentScorenum = ((weightLab*labAverage)+(weightQuiz)
										*quizAverage)+(weightAttendance*attendanceAverage);
								currentScoreden = (weightLab+weightQuiz+weightAttendance);
								currentScore = currentScorenum/currentScoreden; //no project, final, exam 2, and exam 1. ending 53
								System.out.println("Current Grade Score: " + currentScore);
							}
							else
							{
								currentScorenum = ((weightLab*labAverage)+(weightQuiz)*quizAverage);
								currentScoreden = (weightLab+weightQuiz);
								currentScore = currentScorenum/currentScoreden; //no attendance, project, final, exam 2, and exam 1. ending 54
								System.out.println("Current Grade Score: " + currentScore);
							}
						
						}
						else
						{
							System.out.print("Do you know your attendance average? ");
							attendanceAnswer = keyboard.next();
							attendanceAnswer = attendanceAnswer.toUpperCase();
							if ((attendanceAnswer.equals("YES")) ||
								(attendanceAnswer.equals("Y")))
							{
								System.out.print("Average Attendance Grade: ");
								attendanceAverage = keyboard.nextInt();
								currentScorenum = ((weightLab*labAverage)
										+(weightAttendance*attendanceAverage));
								currentScoreden = (weightLab+weightAttendance);
								currentScore = currentScorenum/currentScoreden; //no quiz, project, final exam, exam 2, and exam 1. ending 55
								System.out.println("Current Grade Score: " + currentScore);
							}
							else
							{
								currentScorenum = ((weightLab*labAverage));
								currentScoreden = (weightLab);
								currentScore = currentScorenum/currentScoreden; //no attendance, quiz, project, exam 2, final and exam 1. ending 56
								System.out.println("Current Grade Score: " + currentScore);
							}
						}
					}
				}
				else //else for lab
				{
					System.out.print("Do you know your project average? ");
					projectAnswer = keyboard.next();
					projectAnswer = projectAnswer.toUpperCase();
					if((projectAnswer.equals("YES")) || (projectAnswer.equals("Y")))
					{
						System.out.print("Average Project Grade: ");
						projectAverage = keyboard.nextInt();
						System.out.print("Do you know your quiz average? ");
						quizAnswer = keyboard.next();
						quizAnswer = quizAnswer.toUpperCase();
						if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
						{
							System.out.print("Average Quiz Grade: ");
							quizAverage = keyboard.nextInt();
							System.out.print("Do you know your attendance average? ");
							attendanceAnswer = keyboard.next();
							attendanceAnswer = attendanceAnswer.toUpperCase();
							if ((attendanceAnswer.equals("YES")) ||
								(attendanceAnswer.equals("Y")))
							{
								System.out.print("Average Attendance Grade: ");
								attendanceAverage = keyboard.nextInt();
								currentScorenum = ((weightProject*projectAverage)+(weightQuiz)
										*quizAverage)+(weightAttendance*attendanceAverage);
								currentScoreden = (weightProject+weightQuiz+weightAttendance);
								currentScore = currentScorenum/currentScoreden; //no lab, final, exam 2, and exam 1. ending 57
								System.out.println("Current Grade Score: " + currentScore);
							}
							else
							{
								currentScorenum = ((weightProject*projectAverage)+(weightQuiz)
								*quizAverage);
								currentScoreden = (weightProject+weightQuiz);
								currentScore = currentScorenum/currentScoreden; //no attendance, lab, final, exam 2, and exam 1. ending 58
								System.out.println("Current Grade Score: " + currentScore);
							}
						
						}
						else
						{
							System.out.print("Do you know your attendance average? ");
							attendanceAnswer = keyboard.next();
							attendanceAnswer = attendanceAnswer.toUpperCase();
							if ((attendanceAnswer.equals("YES")) ||
								(attendanceAnswer.equals("Y")))
							{
								System.out.print("Average Attendance Grade: ");
								attendanceAverage = keyboard.nextInt();
								currentScorenum = ((weightProject*projectAverage)
								+(weightAttendance*attendanceAverage));
								currentScoreden = (weightProject+weightAttendance);
								currentScore = currentScorenum/currentScoreden; //no quiz, lab, final, exam 2, and final. ending 59
								System.out.println("Current Grade Score: " + currentScore);
							}
							else
							{
								currentScorenum = ((weightProject*projectAverage));
								currentScoreden = (weightProject);
								currentScore = currentScorenum/currentScoreden; //no quiz, attendance,lab, final, exam 2, and exam 1. ending 60
								System.out.println("Current Grade Score: " + currentScore);
							}
						}
					}
					else
					{
						System.out.print("Do you know your quiz average? ");
						quizAnswer = keyboard.next();
						quizAnswer = quizAnswer.toUpperCase();
						if((quizAnswer.equals("YES")) || (quizAnswer.equals("Y")))
						{
							System.out.print("Average Quiz Grade: ");
							quizAverage = keyboard.nextInt();
							System.out.print("Do you know your attendance average? ");
							attendanceAnswer = keyboard.next();
							attendanceAnswer = attendanceAnswer.toUpperCase();
							if ((attendanceAnswer.equals("YES")) ||
								(attendanceAnswer.equals("Y")))
							{
								System.out.print("Average Attendance Grade: ");
								attendanceAverage = keyboard.nextInt();
								currentScorenum = ((weightQuiz)*quizAverage)+(weightAttendance*attendanceAverage);
								currentScoreden = (weightQuiz+weightAttendance);
								currentScore = currentScorenum/currentScoreden; //no project, lab, final, exam 2, and exam 1. ending 61
								System.out.println("Current Grade Score: " + currentScore);
							}
							else
							{
								currentScorenum = ((weightQuiz)*quizAverage);
								currentScoreden = (weightQuiz);
								currentScore = currentScorenum/currentScoreden; //no attendance, project, lab, final, exam 2, and exam 1. ending 62
								System.out.println("Current Grade Score: " + currentScore);
							}
						
						}
						else
						{
							System.out.print("Do you know your attendance average? ");
							attendanceAnswer = keyboard.next();
							attendanceAnswer = attendanceAnswer.toUpperCase();
							if ((attendanceAnswer.equals("YES")) ||
								(attendanceAnswer.equals("Y")))
							{
								System.out.print("Average Attendance Grade: ");
								attendanceAverage = keyboard.nextInt();
								currentScorenum = ((weightAttendance*attendanceAverage));
								currentScoreden = (weightAttendance);
								currentScore = currentScorenum/currentScoreden; //no quiz, project, lab, final, exam 2, and exam 1. ending 63
								System.out.println("Current Grade Score: " + currentScore);
							}
							else
							{
								currentScorenum = 0;
								currentScoreden = 0;
								currentScore = 0; //no scores. ending 64
								System.out.println("Current Grade Score: " + currentScore);
							}
						}
					}
				}
			}
		}
		
		if (gradeEntered.equals("A"))
		{
			finalOverallScore = A;
		}
		else if (gradeEntered.equals("B"))
		{
			finalOverallScore = B;
			
		}
		else if (gradeEntered.equals("C"))
		{
			finalOverallScore = C;
		}
		else if (gradeEntered.equals("D"))
		{
			finalOverallScore = D;
		}
		else
		{
			finalOverallScore = F;
		}
		
		if ((currentScoreden == 100)) //if branch for displaying letterGrade and
		//or what average needs to be for remaining assignments
		{
			if ((currentScore >= 90))
			{
				gradeEarned = "A";
				System.out.println("Your current letter grade is a " + gradeEarned);
				if ((gradeEarned.equals(gradeEntered)))
				{
					System.out.println("Congratulations! You received the " + gradeEntered 
					+ "that you wanted!" );
				}
				else 
				{
					System.out.print("Sorry, you cannot receive an " 
					+ gradeEntered + " in the course");
				}
			}
			else if ((currentScore >= 80))
			{
				gradeEarned = "B";
				System.out.println("Your current letter grade is a " + gradeEarned);
				if ((gradeEarned.equals(gradeEntered)))
				{
					System.out.println("Congratulations! You received the " + gradeEntered 
					+ " that you wanted!" );
				}
				else 
				{
					System.out.print("Sorry, you cannot receive an " 
					+ gradeEntered + " in the course");
				}
			}
			else if ((currentScore >= 70))
			{
				gradeEarned = "C";
				System.out.println("Your current letter grade is a " + gradeEarned);
				if ((gradeEarned.equals(gradeEntered)))
				{
					System.out.println("Congratulations! You received the " + gradeEntered 
					+ "that you wanted!" );
				}
				else 
				{
					System.out.print("Sorry, you cannot receive an " 
					+ gradeEntered + " in the course");
				}
			}
			else if ((currentScore >= 60))
			{
				gradeEarned = "D";
				System.out.println("Your current letter grade is a " + gradeEarned);
				if ((gradeEarned.equals(gradeEntered)))
				{
					System.out.println("Congratulations! You received the " + gradeEntered 
					+ "that you wanted!" );
				}
				else 
				{
					System.out.print("Sorry, you cannot receive an " 
					+ gradeEntered + " in the course");
				}
			}
			else
			{
				gradeEarned = "F";
				System.out.println("Your current letter grade is a " + gradeEarned);
				if ((gradeEarned.equals(gradeEntered)))
				{
					System.out.println("Congratulations! You received the " + gradeEntered 
					+ "that you wanted!" );
				}
				else 
				{
					System.out.print("Sorry, you cannot receive an " 
					+ gradeEntered + " in the course");
				}
			}
		}
		else //else for weight total != to 100
		{
			if ((currentScore >= 90))
			{
				gradeEarned = "A";
				System.out.println("Your current letter grade is a " + gradeEarned);
				double avgToFinalLetterGradeNum, 
				avgToFinalLetterGradeDen, avgToFinalLetterGrade;
				avgToFinalLetterGradeNum = ((100*finalOverallScore)
				-(currentScorenum));
				avgToFinalLetterGradeDen = (100-currentScoreden);
				avgToFinalLetterGrade = avgToFinalLetterGradeNum
				/avgToFinalLetterGradeDen;
				if (avgToFinalLetterGrade <= 100)
				{
					System.out.println("You have to score an average greater"
					+ " than or equal to " + avgToFinalLetterGrade + " in the");
					System.out.println("remaining grade items to receive an " + 
					gradeEntered + " in the course");
				}
				else
				{
					System.out.println("Sorry, you cannot receive an " + gradeEarned + " in the course");
				}
			}
			else if ((currentScore >= 80))
			{
				gradeEarned = "B";
				System.out.println("Your current letter grade is a " + gradeEarned);
				double avgToFinalLetterGradeNum, 
				avgToFinalLetterGradeDen, avgToFinalLetterGrade;
				avgToFinalLetterGradeNum = ((100*finalOverallScore)
				-(currentScorenum));
				avgToFinalLetterGradeDen = (100-currentScoreden);
				avgToFinalLetterGrade = avgToFinalLetterGradeNum
				/avgToFinalLetterGradeDen;
				if (avgToFinalLetterGrade <= 100)
				{
					System.out.println("You have to score an average greater"
					+ " than or equal to " + avgToFinalLetterGrade + " in the");
					System.out.println("remaining grade items to receive an " + 
					gradeEntered + " in the course");
				}
				else
				{
					System.out.println("Sorry, you cannot receive an " + gradeEarned + " in the course");
				}
			}
			else if ((currentScore >= 70))
			{
				gradeEarned = "C";
				System.out.println("Your current letter grade is a " + gradeEarned);
				double avgToFinalLetterGradeNum, 
				avgToFinalLetterGradeDen, avgToFinalLetterGrade;
				avgToFinalLetterGradeNum = ((100*finalOverallScore)
				-(currentScorenum));
				avgToFinalLetterGradeDen = (100-currentScoreden);
				avgToFinalLetterGrade = avgToFinalLetterGradeNum
				/avgToFinalLetterGradeDen;
				if (avgToFinalLetterGrade <= 100)
				{
					System.out.println("You have to score an average greater"
					+ " than or equal to " + avgToFinalLetterGrade + " in the");
					System.out.println("remaining grade items to receive an " + 
					gradeEntered + " in the course");
				}
				else
				{
					System.out.println("Sorry, you cannot receive an " + gradeEarned + " in the course");
				}
			}
			else if ((currentScore >= 60))
			{
				gradeEarned = "D";
				System.out.println("Your current letter grade is a " + gradeEarned);
				double avgToFinalLetterGradeNum, 
				avgToFinalLetterGradeDen, avgToFinalLetterGrade;
				avgToFinalLetterGradeNum = ((100*finalOverallScore)
				-(currentScorenum));
				avgToFinalLetterGradeDen = (100-currentScoreden);
				avgToFinalLetterGrade = avgToFinalLetterGradeNum
				/avgToFinalLetterGradeDen;
				if (avgToFinalLetterGrade <= 100)
				{
					System.out.println("You have to score an average greater"
					+ " than or equal to " + avgToFinalLetterGrade + " in the");
					System.out.println("remaining grade items to receive an " + 
					gradeEntered + " in the course");
				}
				else
				{
					System.out.println("Sorry, you cannot receive an " + gradeEarned + " in the course");
				}
			}
			else
			{
				gradeEarned = "F";
				System.out.println("Your current letter grade is a " + gradeEarned);
				double avgToFinalLetterGradeNum, 
				avgToFinalLetterGradeDen, avgToFinalLetterGrade;
				avgToFinalLetterGradeNum = ((100*finalOverallScore)
				-(currentScorenum));
				avgToFinalLetterGradeDen = (100-currentScoreden);
				avgToFinalLetterGrade = avgToFinalLetterGradeNum
				/avgToFinalLetterGradeDen;
				if (avgToFinalLetterGrade <= 100)
				{
					System.out.println("You have to score an average greater"
					+ " than or equal to " + avgToFinalLetterGrade + " in the");
					System.out.println("remaining grade items to receive an " + 
					gradeEntered + " in the course");
				}
				else
				{
					System.out.println("Sorry, you cannot receive an " + gradeEarned + " in the course");
				}
			
			}
		}
	
	

}
}
