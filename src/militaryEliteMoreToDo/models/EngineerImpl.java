package militaryEliteMoreToDo.models;

import militaryEliteMoreToDo.enumerations.Corp;
import militaryEliteMoreToDo.interfaces.Engineer;
import militaryEliteMoreToDo.interfaces.Repair;

import java.util.ArrayList;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corp corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(System.lineSeparator()).append("Corps: " + this.getCorps()).
                append(System.lineSeparator()).append("Repairs:");
        this.repairs.forEach(repair -> {
            sb.append(System.lineSeparator());
            sb.append("  ").append(repair.toString());
        });
        return sb.toString().trim();
    }
}
