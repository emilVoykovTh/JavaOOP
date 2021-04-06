package militaryEliteMoreToDo.models;

import militaryEliteMoreToDo.enumerations.Corp;
import militaryEliteMoreToDo.interfaces.Commando;
import militaryEliteMoreToDo.interfaces.Mission;

import java.util.ArrayList;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corp corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(System.lineSeparator()).append("Corps: " + this.getCorps()).
                append(System.lineSeparator()).append("Missions:");
        this.missions.forEach(mission -> {
            sb.append(System.lineSeparator());
            sb.append("  ").append(mission.toString());
        });
        return sb.toString().trim();
    }
}
