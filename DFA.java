package fa.dfa;

import fa.State;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
/**
 *  Class for creating a DFA object containing specified states using a specified
 *  alphabet.
 *  @author Heather N. Larsen, Taylor Roberts
 *  @version    1.0     2018/09/14:13:52
 */
public class DFA implements fa.FAInterface, fa.dfa.DFAInterface {
    /** A set of states within the DFA */
    private Set<DFAState> Q;
    /** The alphabet for the language of the DFA */
    private Set sigma;
    /** Map for DFA transitions and states */
    private HashMap map;
    /** DFA start state */
    private DFAState q0;
    /***************************GLOBAL.VARIABLES********************************/
    /**
     *  Default constructor.
     */
    public DFA() {
        Q       = new HashSet<DFAState>();
        sigma   = new HashSet();
        map     = new HashMap();
        q0      = null;
    }/*********************************DFA**************************************/
    @Override
    public void addStartState(String name) {
        q0 = new DFAState(name);
        Q.add(q0);
    }/*******************************ADD.START.STATE****************************/
    @Override
    public void addState(String name) {
        DFAState newState = new DFAState(name);
        Q.add(newState);
    }/********************************ADD.STATE*********************************/
    @Override
    public void addFinalState(String name) {
        DFAState finalState = new DFAState(name);
        finalState.setFinal();
        Q.add(finalState);
    }/******************************ADD.FINAL.STATE*****************************/

    @Override
    public void addTransition(String fromState, char onSymb, String toState) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<? extends State> getStates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<? extends State> getFinalStates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public State getStartState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Character> getABC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean accepts(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DFAState getToState(DFAState from, char onSymb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        String s = "Q = { " /*+ states*/ + " }" + System.lineSeparator()
                + "Sigma = { " /*+ alphabet*/ + " }" + System.lineSeparator()
                + "Delta =" + System.lineSeparator()
                + "\t\t" /*+alphabet sep by \t*/ + System.lineSeparator()
                + "\t" /*+states sep by \t acc to alphabet*/ + System.lineSeparator()
                + "q0 = " /*+start state*/ + System.lineSeparator()
                + "F = { " /*+final states*/ + " }" + System.lineSeparator();
                
        return s;
    }
}/***********************************DFA_CLASS**********************************/
