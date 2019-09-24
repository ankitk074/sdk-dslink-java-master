package stringtojson;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class stringjson {
 public static void main(String[] args){
	 String JSON="{\"meta\": {\"is\":\"dsa/link\",\"mode\":\"refresh\",\"meta\":null,\"compression\":null},\"updates\": [{\"$RelativePath\":\"/nodeMeta\",\"$name\":\"DSLinkMetadata\",\"$writable\":\"never\",\"$type\":\"string\",\"$is\":\"node\"},{\"$RelativePath\":\"/nxconfig\",\"$name\":\"nxconfig\",\"$writable\":\"never\",\"$type\":\"string\",\"$NXRG\":\"G1\",\"$is\":\"node\"}]}";
	 Gson g = new Gson();
	 Gson jsonObject=new Gson(JSON); 

 }
 
    
	public static void filter()
	{}
}
