package g1.service;

import g1.dao.PatientDao;
import g1.entity.Patient;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PatientService {

    PatientDao patientDao=PatientDao.getInstance();


    public Patient[] sortPatientWithAge(){
       Patient [] patients= patientDao.getPatient();

        return Arrays.stream(patients).
                sorted(Comparator.comparing(Patient::getAge ,Comparator.reverseOrder())).toArray(Patient[]::new);
    }
}
