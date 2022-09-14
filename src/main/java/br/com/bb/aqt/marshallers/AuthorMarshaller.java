package br.com.bb.aqt.marshallers;
import java.io.IOException;

import org.infinispan.protostream.MessageMarshaller;

import br.com.bb.aqt.models.Author;

public class AuthorMarshaller implements MessageMarshaller<Author> {

    @Override   public String getTypeName() {
       return "br.com.bb.aqt.models.Author";
    }
 
    @Override   public Class<? extends Author> getJavaClass() {
       return Author.class;
    }
 
    @Override   public void writeTo(ProtoStreamWriter writer, Author author) throws IOException {
       writer.writeString("name", author.getName());
       writer.writeString("surname", author.getSurname());
    }
 
    @Override
    public Author readFrom(ProtoStreamReader reader) throws IOException {
       String name = reader.readString("name");
       String surname = reader.readString("surname");
       return new Author(name, surname);
    }
 }