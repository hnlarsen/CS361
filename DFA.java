package fa.dfa;

import fa.State;
import java.util.Set;
import java.util.AbstractSet;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/**
 *  
 *  @author Heather N. Larsen, Taylor Roberts
 *  @version    1.0     2018/09/14:13:52
 */
public class DFA implements fa.FAInterface, fa.dfa.DFAInterface {
    AbstractSet Q;
    ConcurrentMap d;
    /**
     *  Default constructor.
     */
    public DFA() {
        
    }/*********************************DFA**************************************/

    @Override
    public void addStartState(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addState(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addFinalState(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
        
    }
}/***********************************DFA_CLASS**********************************/
