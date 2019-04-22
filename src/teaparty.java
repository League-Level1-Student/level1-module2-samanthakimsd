import javax.swing.JOptionPane;

public class teaparty {
private String name;
private boolean isWoman;
private boolean isKnited;
public void welcome(String name, boolean isWoman, boolean isKnited) {
	this.name=name;
	this.isWoman=isWoman;
	this.isKnited=isKnited;
	if(name.equals("Jane Austen")) {
		JOptionPane.showMessageDialog(null, "Hello Ms. Austen");
	}
}

@Test
public void test() {
        TeaParty teaParty = new TeaParty();
        String greeting = teaParty.welcome(null, false, false);
        assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
        assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
        assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
}
}


}