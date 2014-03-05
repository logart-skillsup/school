package sample;

import java.util.List;
import java.util.Map;

/**
 * Created by User on 05.03.14.
 */
public class PupilController implements PupilService {
    private Map<Integer,Pupil> school;
    static int count;

    PupilController()
    {
        count = 0;
    }

    @Override
    public List<Pupil> list() {
        return null;
    }

    @Override
    public void add(String name) {
        Pupil newPupil = new Pupil();
        newPupil.setName(name);
        newPupil.setId(count);
        school.put(count, newPupil);
        count++;
    }

    @Override
    public Pupil get(int id) {
        return school.get(id);
    }

    @Override
    public void update(Pupil pupil) {
        school.put(pupil.getId(), pupil);
    }

    @Override
    public void delete(int id) {
        school.remove(id);
    }

    @Override
    public List<Double> marks(Pupil pupil) {
        return null;
    }

    @Override
    public List<Double> averageMarks(Pupil pupil) {
        return null;
    }
}
