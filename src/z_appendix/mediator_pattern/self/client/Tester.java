package z_appendix.mediator_pattern.self.client;

import java.util.Arrays;

import z_appendix.mediator_pattern.self.colleague.Colleague;
import z_appendix.mediator_pattern.self.mediator.Mediator;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月17日
**/
public class Tester {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Colleague colleagueA = new Colleague("A");
        Colleague colleagueB = new Colleague("B");
        Colleague colleagueC = new Colleague("C");
        Colleague colleagueD = new Colleague("D");
        Colleague colleagueE = new Colleague("E");
        String[] aTargets = {colleagueC.getId(), colleagueE.getId()};
        String[] bTargets = {};
        String[] cTargets = {colleagueA.getId(), colleagueD.getId(), colleagueE.getId()};
        String[] dTargets = {colleagueA.getId()};
        String[] eTargets = {colleagueB.getId()};
        mediator.addColleague(colleagueA, Arrays.asList(aTargets));
        mediator.addColleague(colleagueB, Arrays.asList(bTargets));
        mediator.addColleague(colleagueC, Arrays.asList(cTargets));
        mediator.addColleague(colleagueD, Arrays.asList(dTargets));
        mediator.addColleague(colleagueE, Arrays.asList(eTargets));
        mediator.link(colleagueA, colleagueB);
        mediator.link(colleagueA, colleagueC);
    }
}
