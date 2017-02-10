package projet1;

import projet2.IntQuestion;


/**

 * Cette classe implement IntQuestion et donc ses fonctions dont la sa stratégie est l'addition


 */


public class AdditionQuestion implements IntQuestion {
	
	 private int a, b;  // The numbers in the problem.

	    public AdditionQuestion() { // constructor
	        a = (int)(Math.random() * 50 + 1);
	        b = (int)(Math.random() * 50);
	    }
	
	    /**

	     * provient de l'interface
	     * @return la question 

	     */
	    
	    
	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return "What is " + a + " + " + b + " ?";
	}
	
	/**

     * provient de l'interface
     * @return la reponse 

     */
	@Override
	public int getCorrectAnswer() {
		// TODO Auto-generated method stub
		return a + b;
	}
	
	
}
