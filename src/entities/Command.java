package entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class Command {
	public static Response Run(Payload payload) 
    { 
		String basePath = "/path/to/github/cloned/repository/";
		String test = "";
        try 
        { 
        	String cmd = "/bin/sh "+basePath+"run/test.sh "+basePath+"testbed/"+payload.Testbed+".json"+" "+basePath+"testCases/"+payload.Protocol+".robot";
        	Process p=Runtime.getRuntime().exec(cmd); 
            
            test = "Command has been executed and script is running in the background";
            return Response.ok(test)
    				.header("Access-Control-Allow-Origin", "*")
    				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
    				.header("Access-Control-Allow-Headers", "Content-Type")
    				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD" )
    				.allow("OPTIONS")
    				.build(); 

        }
        catch(IOException e1) { test = "FAIL due to IO exception";
        return Response.status(Status.NOT_FOUND)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Headers", "Content-Type")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD" )
				.allow("OPTIONS")
				.build();}
		} 
    }

