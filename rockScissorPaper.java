class rockScissorPaper{
	String result;
	String game(String p1, String p2){
		if (p1.equals(p2)) {
        	return result = "draw";
        }
        else if (p1.equals("rock") || p1.equals("Rock")){
        	if (p2.equals("scissor") || p2.equals("Scissor")){
        		return result = "player1 win!";
        	}
        	else if (p2.equals("paper") || p2.equals("Paper")){
        		return result = "player2 win!";
        	}
        }
        else if (p1.equals("scissor") || p1.equals("Scissor")){
        	if (p2.equals("paper") || p2.equals("Paper")){
        		return result = "player1 win!";
        	}
        	else if (p2.equals("rock") || p2.equals("Rock")){
        		return result = "player2 win!";
        	}
        }
        else if (p1.equals("paper") || p1.equals("Paper")){
        	if (p2.equals("rock") || p2.equals("Rock")){
        		return result = "player1 win!";
        	}
        	else if (p2.equals("scissor") || p2.equals("Scissor")){
        		return result = "player2 win!";
        	}
        }
        else{
        	return result = "error";
        }
        return result;
    }
	void printRe(String x){
		System.out.println(x);
	}
	public static void main(String[] argv){
		rockScissorPaper g = new rockScissorPaper();
		String y = g.game("rock","scissor");
		g.printRe(y);
	}
}