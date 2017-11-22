package z_appendix.mediator_pattern.self.mediator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import z_appendix.mediator_pattern.self.colleague.Colleague;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月17日
**/
public class Mediator {
    private Map<String, Colleague> colleagues;
    private Map<String, List<String>> router;
    
    public Mediator() {
        super();
        this.colleagues = new HashMap<String, Colleague>();
        this.router = new HashMap<String, List<String>>();
    }

    public void addColleague(Colleague c, List<String> targetIds) {
        colleagues.put(c.getId(), c);
        router.put(c.getId(), targetIds);
    }
    
    public void link(String originorId, String targetId) {
        Colleague from = colleagues.get(originorId);
        if (from == null) {
            return;
        }
        Colleague to = colleagues.get(targetId);
        if (to == null) {
            return;
        }
        List<String> targetIds = router.get(originorId);
        if (targetIds.contains(targetId)) {
            to.receiveMsg("HELLO", from);
        } else {
            System.out.println("contact NOT ALLOWED");
        }
    }
    
    public void link(Colleague from, Colleague to) {
        if (from == null) {
            return;
        }
        if (to == null) {
            return;
        }
        List<String> targetIds = router.get(from.getId());
        if (targetIds.contains(to.getId())) {
            to.receiveMsg("HELLO", from);
        } else {
            System.out.println("contact NOT ALLOWED");
        }
    }
    
}
