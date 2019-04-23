package com.example.demo0403.domain.solr;

import java.io.Serializable;

import org.apache.solr.client.solrj.beans.Field;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SolrUsers implements Serializable{

    /**  */
    private static final long serialVersionUID = 8062661713922183401L;
    
    @Field("id")
    private String id;

    @Field("name")
    private String name;
}
