package lrn.cc.drill.lesson;

import java.io.StringWriter;
import java.util.Random;

import com.coderscampus.generator.domain.GenMeta;
import com.coderscampus.generator.service.GenBase;
import com.coderscampus.generator.util.Names;

public class U3L08 extends GenBase {
	
	public U3L08(GenMeta genMeta) {
		super(genMeta);
	}

    @Override
    public StringWriter generate(StringWriter stringWriter) {
        this.context.put("one", Names.randomName().toLowerCase());
        this.context.put("two", Names.randomName().toLowerCase());
        this.context.put("three", Names.randomName().toLowerCase());
        this.context.put("four", Names.randomName().toLowerCase());
        this.context.put("ClassName", this.genMetaList.get(defaultPosition).getName());
        this.context.put("package", this.genMetaList.get(defaultPosition).getPakage());
        merge( null);
        write();
        return writer;
    }

    public void write(){
        this.writeJava(writer.toString());
    }
}
