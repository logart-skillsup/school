package sample;

import java.util.List;

/**
 * Created by User on 05.03.14.
 */
public interface PupilService {
    List<Pupil> list();
    void add(String name);
    Pupil get(int id);
    void update(Pupil pupil);
    void delete(int id);
    List<Double> marks(Pupil pupil);
    List<Double> averageMarks(Pupil pupil);
}
