/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE390_Error_Without_Action__mkdirs_09.java
Label Definition File: CWE390_Error_Without_Action.label.xml
Template File: point-flaw-09.tmpl.java
*/
/*
* @description
* CWE: 390 Detection of Error Condition Without Action
* Sinks: mkdirs
*    GoodSink: Throw Exception if dirs cannot be created
*    BadSink : Do nothing if dirs cannot be created
* Flow Variant: 09 Control flow: if(IO.static_final_t) and if(IO.static_final_f)
*
* */

package testcases.CWE390_Error_Without_Action;

import testcasesupport.*;

import javax.servlet.http.*;

import java.io.File;
import java.lang.SecurityException;

public class CWE390_Error_Without_Action__mkdirs_09 extends AbstractTestCase
{

    public void bad() throws Throwable
    {
        if (IO.static_final_t)
        {
            File dirs = new File("./lvl_1/lvl_2/lvl_3/");
            if( !dirs.mkdirs() )
            {
                /* FLAW: do nothing if dirs cannot be created */
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            File dirs = new File("./lvl_1/lvl_2/lvl_3/");
            if( !dirs.mkdirs() )
            {
                /* FIX: report the mkdirs failure and throw a new Exception */
                IO.writeLine("The directories could not be created");
                StringBuilder sb = new StringBuilder();
                sb.append("The directories (");
                sb.append(dirs.getAbsolutePath());
                sb.append(") could not be created: ");
                throw new Exception(sb.toString());
            }

        }
    }

    /* good1() changes IO.static_final_t to IO.static_final_f */
    private void good1() throws Throwable
    {
        if(IO.static_final_f)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            File dirs = new File("./lvl_1/lvl_2/lvl_3/");
            if( !dirs.mkdirs() )
            {
                /* FLAW: do nothing if dirs cannot be created */
            }
        }
        else {

            File dirs = new File("./lvl_1/lvl_2/lvl_3/");
            if( !dirs.mkdirs() )
            {
                /* FIX: report the mkdirs failure and throw a new Exception */
                IO.writeLine("The directories could not be created");
                StringBuilder sb = new StringBuilder();
                sb.append("The directories (");
                sb.append(dirs.getAbsolutePath());
                sb.append(") could not be created: ");
                throw new Exception(sb.toString());
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if(IO.static_final_t)
        {
            File dirs = new File("./lvl_1/lvl_2/lvl_3/");
            if( !dirs.mkdirs() )
            {
                /* FIX: report the mkdirs failure and throw a new Exception */
                IO.writeLine("The directories could not be created");
                StringBuilder sb = new StringBuilder();
                sb.append("The directories (");
                sb.append(dirs.getAbsolutePath());
                sb.append(") could not be created: ");
                throw new Exception(sb.toString());
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            File dirs = new File("./lvl_1/lvl_2/lvl_3/");
            if( !dirs.mkdirs() )
            {
                /* FLAW: do nothing if dirs cannot be created */
            }

        }

    }

    public void good() throws Throwable
    {
        good1();
        good2();
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
