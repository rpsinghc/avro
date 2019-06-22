package com.avro.frtu;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException {
        Schema schema = new Schema.Parser().parse(Main.class.getResourceAsStream("/avro-example.avsc"));

        AveroDataModel sample = AveroDataModel.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setName("fred")
                .setEventTime(System.currentTimeMillis())
                .build();

        final File testFolder = new File("target/");
        final boolean mkdirs = testFolder.mkdirs();
        if (!mkdirs) {
            System.err.println("Impossible to create folder " + testFolder.getAbsolutePath());
        }
        File file = new File(testFolder, sample.getClass().getSimpleName() + ".avro");

        DatumWriter<AveroDataModel> userDatumWriter = new SpecificDatumWriter<AveroDataModel>(AveroDataModel.class);
        DataFileWriter<AveroDataModel> dataFileWriter = new DataFileWriter<AveroDataModel>(userDatumWriter);
        dataFileWriter.create(sample.getSchema(), file);
        dataFileWriter.append(sample);
        dataFileWriter.close();

        // Deserialize users from disk
        DatumReader<GenericRecord> datumReader = new GenericDatumReader<GenericRecord>(schema);
        DataFileReader<GenericRecord> dataFileReader = new DataFileReader<GenericRecord>(file, datumReader);
        GenericRecord user = null;
        while (dataFileReader.hasNext()) {
            user = dataFileReader.next(user);
            System.out.println(user);
        }
    }
}
