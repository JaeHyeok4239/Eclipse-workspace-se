
public class MermaidPrincessMain {

	public static void main(String[] args) {
		System.out.println("------------MermaidPrincess--------------");
		MermaidPrincess mermaidPrincess = new MermaidPrincess();
		mermaidPrincess.speak();
		mermaidPrincess.think();
		mermaidPrincess.fastSwim();
		mermaidPrincess.liveSea();
		
		System.out.println("--------------Princess-----------------");
		Princess princess = mermaidPrincess;
		princess.speak();
		princess.think();
		
		/*
		 * princess.fastSwim(); 
		 * princess.liveSea();
		 */
		
		System.out.println("------------Mermaid---------------");
		Mermaid mermaid = mermaidPrincess;
		mermaid.fastSwim();
		mermaid.liveSea();
		
		
		/*
		 * mermaid.speak(); 
		 * mermaid.think();
		 */

	}

}
