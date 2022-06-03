package exerciciosPropostos8;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post(
						sdf.parse("21/06/2018 13:05:44"),
								"Traveling to New Zealand", 
								"I'm going to visit this wonderful country!", 
								12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Bla bla bla");
		Comment c4 = new Comment("Bi bi bi bi");
		
		Post p2 = new Post(
						sdf.parse("21/06/2019 13:05:44"),
								"Traveling to New York", 
								"I'm going to visit this wonderful city!", 
								12);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}
