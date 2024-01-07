package question2;

/**
 * Classe-test Pile3Test.
 * 
 * @author (votre nom)
 * @version (un numÃ©ro de version ou une date)
 * 
 *          Les classes-test sont documentÃ©es ici :
 *          http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 *          et sont basÃ©es sur le document Â© 2002 Robert A. Ballance intitulÃ©
 *          Â«JUnit: Unit Testing FrameworkÂ».
 * 
 *          Les objets Test (et TestSuite) sont associÃ©s aux classes Ã  tester
 *          par la simple relation yyyTest (e.g. qu'un Test de la classe
 *          Name.java se nommera NameTest.java); les deux se retrouvent dans le
 *          mÃªme paquetage. Les "engagements" (anglais : "fixture") forment un
 *          ensemble de conditions qui sont vraies pour chaque mÃ©thode Test Ã 
 *          exÃ©cuter. Il peut y avoir plus d'une mÃ©thode Test dans une classe
 *          Test; leur ensemble forme un objet TestSuite. BlueJ dÃ©couvrira
 *          automatiquement (par introspection) les mÃ©thodes Test de votre
 *          classe Test et gÃ©nÃ©rera la TestSuite consÃ©quente. Chaque appel d'une
 *          mÃ©thode Test sera prÃ©cÃ©dÃ© d'un appel de setUp(), qui rÃ©alise les
 *          engagements, et suivi d'un appel Ã  tearDown(), qui les dÃ©truit.
 */
public class Pile3Test extends junit.framework.TestCase {
    // DÃ©finissez ici les variables d'instance nÃ©cessaires Ã  vos engagements;
    // Vous pouvez Ã©galement les saisir automatiquement du prÃ©sentoir
    // Ã  l'aide du menu contextuel "PrÃ©sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du prÃ©sentoir (les objets sans constructeur, comme int, float, etc.).

    private PileI p1;
    private PileI p2;

    public Pile3Test() {
    }

    /**
     * Met en place les engagements.
     * 
     * Méthode appelée avant chaque appel de méthode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        p1 = new question2.Pile3();
        p2 = new question2.Pile3();
    }

    /**
     * Supprime les engagements
     * 
     * Méthode appelée après chaque appel de méthode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        // Libérez ici les ressources engagées par setUp()
    }

    /**
     * Il ne vous reste plus qu'à définir une ou plusieurs méthodes de test. Ces
     * méthodes doivent vérifier les résultats attendus à l'aide d'assertions
     * assertTrue(<boolean>). Par convention, leurs noms devraient débuter par
            * "test". Vous pouvez ébaucher le corps grâce au menu contextuel
     * "Enregistrer une méthode de test".
     */
    public void test_pile() throws Exception {
        p1.empiler("c");
        p1.empiler("b");
        p1.empiler("a");

       
        p2.empiler("c");
        p2.empiler("b");
        p2.empiler("a");
        
        assertTrue( p1.equals(p2));
        assertTrue( p2.equals(p1));
        assertTrue( p1.equals(p1));

        p2.empiler("e");
        assertFalse(p1.equals(p2));
        
        p1.empiler("e");
        assertTrue(p1.equals(p2));

    }

}
