package militaryEliteMoreToDo.models;

import militaryEliteMoreToDo.enumerations.Corp;
import militaryEliteMoreToDo.interfaces.SpecialisedSoldier;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corp corps;
    protected SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corp corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return super.toString() + System.lineSeparator() + "Corps: " + this.corps.toString();
    }
}
