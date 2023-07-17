/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE395_NullPointerException_Catch__basic_15.java
Label Definition File: CWE395_NullPointerException_Catch__basic.label.xml
Template File: point-flaw-15.tmpl.java
*/
/*
* @description
* CWE: 395 An object may be null when asked to perform a method; a catch block for NullPointerException is used instead of checking for null objects in the code
* Sinks:
*    GoodSink: check for null reference before taking action
*    BadSink : using catch to detect null references
* Flow Variant: 15 Control flow: switch(7)
*
* */

package testcases.CWE395_NullPointerException_Catch;

import testcasesupport.*;

import java.io.*;

public class CWE395_NullPointerException_Catch__basic_15 extends AbstractTestCase
{

    public void bad() throws Throwable
    {
        switch(7)
        {
        case 7:
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            /* This code could be a part of a user questionnaire */
            String address = null;
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            try
            {
                IO.writeLine("Do you know your forwarding address (y/n)? ");
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                if (bufread2.readLine().equalsIgnoreCase("y"))
                {
                    IO.writeLine("Enter your forwarding address: ");
                    inread2 = new InputStreamReader(System.in);
                    bufread2 = new BufferedReader(inread2);
                    address = bufread2.readLine();
                }
                IO.writeLine("bad() - address length = " + address.length()); /* INCIDENTAL: CWE476 Null Pointer Dereference */
            }
            catch (NullPointerException npe)  /* FLAW: Use of catch block to detect null dereferences */
            {
                IO.writeLine(npe.getMessage());
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }
            }
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            /* This code could be a part of a user questionnaire */
            String address = null;
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            try
            {
                IO.writeLine("Do you know your forwarding address (y/n)? ");
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                if (bufread2.readLine().equalsIgnoreCase("y"))
                {
                    IO.writeLine("Enter your forwarding address: ");
                    inread2 = new InputStreamReader(System.in);
                    bufread2 = new BufferedReader(inread2);
                    address = bufread2.readLine();
                }
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }
            }
            if (address != null) /* FIX: Check for null value before calling a method */
            {
                IO.writeLine("good() - address length = " + address.length());
            }
        }
        break;
        }
    }

    /* good1() change the switch to switch(8) */
    private void good1() throws Throwable
    {
        switch(8)
        {
        case 7:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            /* This code could be a part of a user questionnaire */
            String address = null;
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            try
            {
                IO.writeLine("Do you know your forwarding address (y/n)? ");
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                if (bufread2.readLine().equalsIgnoreCase("y"))
                {
                    IO.writeLine("Enter your forwarding address: ");
                    inread2 = new InputStreamReader(System.in);
                    bufread2 = new BufferedReader(inread2);
                    address = bufread2.readLine();
                }
                IO.writeLine("bad() - address length = " + address.length()); /* INCIDENTAL: CWE476 Null Pointer Dereference */
            }
            catch (NullPointerException npe)  /* FLAW: Use of catch block to detect null dereferences */
            {
                IO.writeLine(npe.getMessage());
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }
            }
        }
        break;
        default:
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            /* This code could be a part of a user questionnaire */
            String address = null;
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            try
            {
                IO.writeLine("Do you know your forwarding address (y/n)? ");
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                if (bufread2.readLine().equalsIgnoreCase("y"))
                {
                    IO.writeLine("Enter your forwarding address: ");
                    inread2 = new InputStreamReader(System.in);
                    bufread2 = new BufferedReader(inread2);
                    address = bufread2.readLine();
                }
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }
            }
            if (address != null) /* FIX: Check for null value before calling a method */
            {
                IO.writeLine("good() - address length = " + address.length());
            }
        }
        break;
        }
    }

    /* good2() reverses the blocks in the switch  */
    private void good2() throws Throwable
    {
        switch(7)
        {
        case 7:
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            /* This code could be a part of a user questionnaire */
            String address = null;
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            try
            {
                IO.writeLine("Do you know your forwarding address (y/n)? ");
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                if (bufread2.readLine().equalsIgnoreCase("y"))
                {
                    IO.writeLine("Enter your forwarding address: ");
                    inread2 = new InputStreamReader(System.in);
                    bufread2 = new BufferedReader(inread2);
                    address = bufread2.readLine();
                }
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }
            }
            if (address != null) /* FIX: Check for null value before calling a method */
            {
                IO.writeLine("good() - address length = " + address.length());
            }
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            /* This code could be a part of a user questionnaire */
            String address = null;
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            try
            {
                IO.writeLine("Do you know your forwarding address (y/n)? ");
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                if (bufread2.readLine().equalsIgnoreCase("y"))
                {
                    IO.writeLine("Enter your forwarding address: ");
                    inread2 = new InputStreamReader(System.in);
                    bufread2 = new BufferedReader(inread2);
                    address = bufread2.readLine();
                }
                IO.writeLine("bad() - address length = " + address.length()); /* INCIDENTAL: CWE476 Null Pointer Dereference */
            }
            catch (NullPointerException npe)  /* FLAW: Use of catch block to detect null dereferences */
            {
                IO.writeLine(npe.getMessage());
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }
            }
        }
        break;
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
