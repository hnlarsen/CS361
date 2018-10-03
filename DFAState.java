package fa.dfa;
/**
 *  Creates a DFAState object to implement in the DFA diagram itself.
 *  @author Heather N. Larsen, Taylor Roberts
 *  @version    1.0     2018/09/14:13:52
 */
public class DFAState extends fa.State {
    /** Determines whether the state is final or not */
    private boolean finalState;    
    /***************************GLOBAL.VARIABLES********************************/
    /**
     *  Default constructor.
     *  @param label name of the state
     */
    public DFAState(String label) {
        super.name      = label;
        this.finalState = false;
    }/*****************************DFA.STATE************************************/
    /**
     *  Sets the state as a final state.
     */
    protected void setFinal() {
        this.finalState = true;
    }/*****************************SET.FINAL************************************/
    /**
     *  @return true if the state is a final state
     */
    protected boolean isFinal() {
        return finalState;
    }/******************************IS.FINAL************************************/
}/*******************************DFA.STATE_CLASS********************************/