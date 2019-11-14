import main.java.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import main.java.Course;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class GivenBlackBox {
    private Class<Course> classUnderTest;

    @SuppressWarnings("unchecked")
    public GivenBlackBox(Object classUnderTest) {
        this.classUnderTest = (Class<Course>) classUnderTest;
    }

    @Parameters
    public static Collection<Object[]> courseGradesUnderTest() {
        Object[][] classes = {
                {CourseGrades0.class},
                {CourseGrades1.class},
                {CourseGrades2.class},
                {CourseGrades3.class},
                {CourseGrades4.class},
                {CourseGrades5.class}

        };
        return Arrays.asList(classes);
    }

    private Course createCourse(String name) throws Exception {
        Constructor<Course> constructor = classUnderTest.getConstructor(String.class);
        return constructor.newInstance(name);
    }

 //   Course oneStudent;
 //   HashMap<String, String> oneStudentExpected = new HashMap<String, String>();

//    Course happyDayGradeBoundary;
//    HashMap<String, String> happyDayGradeBoundaryExpected = new HashMap<String, String>();

    Course obiwan;
    HashMap<String, String> obiwanExpected = new HashMap<String, String>();
    
    Course anakin;
    HashMap<String, String> anakinExpected = new HashMap<String, String>();
    
    Course ahsoka;
    HashMap<String, String> ahsokaExpected = new HashMap<String, String>();
    
    Course yoda;
    HashMap<String, String> yodaExpected = new HashMap<String, String>();
    
    Course mace;
    HashMap<String, String> maceExpected = new HashMap<String, String>();


    @Before
    public void setUp() throws Exception {

    	// Test 1
    	obiwan = createCourse("SER316");
    	obiwan.set_points("Obi-Wan", 85);
    	obiwanExpected.put("Obi-Wan", "B");
    	
    	// Test 2
    	anakin = createCourse("SER316");
    	anakin.set_points("Anakin", 20);
    	anakinExpected.put("Anakin", "F");
    	
    	// Test 3
    	ahsoka = createCourse("SER316");
    	ahsoka.set_points("Ahsoka", 60);
    	ahsokaExpected.put("Ahsoka", "C");
    	
    	// Test 4
    	yoda = createCourse("SER316");
    	yoda.set_points("Yoda", 90);
    	yodaExpected.put("Yoda", "A");
    	
    	// Test 5
    	mace = createCourse("SER316");
    	mace.set_points("Mace", 40);
    	maceExpected.put("Mace", "D");
    	
        // One Student
        // all courses should be created like this
        // Course created with two Students having
/*        oneStudent = createCourse("SER316"); */

        // this would be the expected result after the method countOccurencesLetterGrades is called
/*        oneStudent.set_points("Hanna", 50);
        oneStudentExpected.put("Hanna", "A"); */      
        
        // Happy Day Case Grade Boundaries
        // Four Students mix of grades
/*        happyDayGradeBoundary = createCourse("SER315");
        happyDayGradeBoundary.set_points("100"  , 100);  //A
        happyDayGradeBoundary.set_points(">89"  , 90);  //A
        happyDayGradeBoundary.set_points(">79"  , 89);  //B
        happyDayGradeBoundary.set_points(">59"  , 79);  //C
        happyDayGradeBoundary.set_points(">35"  , 59);  //D
        happyDayGradeBoundary.set_points(">=35" , 35);  //F

        happyDayGradeBoundaryExpected.put("100"  , "A");
        happyDayGradeBoundaryExpected.put(">89"  , "A");
        happyDayGradeBoundaryExpected.put(">79"  , "B");
        happyDayGradeBoundaryExpected.put(">59"  , "C");
        happyDayGradeBoundaryExpected.put(">35"  , "D");
        happyDayGradeBoundaryExpected.put(">=35" , "F"); */
    }

    @After
    public void tearDown() throws Exception {
    }

    // sample test
  /*  @Test
    public void oneStudent() {
        Map<String, String> ans = oneStudent.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(oneStudentExpected));
    } */

    // sample test2
/*    @Test
    public void happyDayGradeBoundaries() {
        Map<String, String> ans = happyDayGradeBoundary.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(happyDayGradeBoundaryExpected));
    } */

    // Test 1
    @Test
    public void obiwan() 
    {
        Map<String, String> ans = obiwan.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(obiwanExpected));
    }
    // Test 2
    @Test
    public void anakin() 
    {
        Map<String, String> ans = anakin.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(anakinExpected));
    }
    // Test 3
    @Test
    public void ahsoka() 
    {
        Map<String, String> ans = ahsoka.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(ahsokaExpected));
    }
    // Test 4
    @Test
    public void yoda() 
    {
        Map<String, String> ans = yoda.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(yodaExpected));
    }
    // Test 5
    @Test
    public void mace() 
    {
        Map<String, String> ans = mace.curveLetterGrades();
        for(Map.Entry<String, String> e : ans.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        assertTrue(ans.equals(maceExpected));
    }
    
}
