package g1;

import g1.Utils.Utils;
import g1.dao.PatientDao;
import g1.entity.Patient;
import g1.service.PatientService;

import java.util.Arrays;

public class MyMain {

    public static void main(String[] args) {
        System.out.println("hello world");
        PatientService patientService=new PatientService();

      Patient[] patients=patientService.sortPatientWithAge();
        System.out.println(Utils.convertToJson(patients));


        }
    }

