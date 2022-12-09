package bean;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * @Author
 * @Date 2022/11/14 17:10
 * @Description
 **/
public class PhaseHandler implements PhaseListener {
    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println("---after---"+phaseEvent.getPhaseId().toString()+"已发生");
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        System.out.println("---before---"+phaseEvent.getPhaseId().toString()+"将发生");
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
