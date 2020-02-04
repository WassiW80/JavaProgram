package com.pattern.program;

public class UsingOneForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line_no = 1;

		// Loop to print desired pattern
		int curr_star = 0;
		for (line_no = 1; line_no <= 7;) {
			// If current star count is less than
			// current line number
			if (curr_star < line_no) {
				System.out.print("* ");
				curr_star++;
				continue;
			}

			// Else time to print a new line
			if (curr_star == line_no) {
				System.out.println("");
				line_no++;
				curr_star = 0;
			}
		}
	}

}
