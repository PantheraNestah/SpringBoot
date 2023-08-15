package com.SpringBoot.jpaMvc.generator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IdGenerator implements IdentifierGenerator {
    @Override
    public String generate(SharedSessionContractImplementor session, Object obj)
    {
        String prefix = "BLGR";
        String suffix = "";
        try{
            Connection con = session.getJdbcConnectionAccess().obtainConnection();
            Statement st = con.createStatement();
            String sql = "SELECT NEXT VALUE FOR blogger_seq";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
            {
                int sequence_val = rs.getInt(1);
                suffix = String.valueOf(sequence_val);
            }
            else return (null);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return (prefix + suffix);
    }
}
