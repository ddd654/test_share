package com.project.tobe.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTestDB is a Querydsl query type for TestDB
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTestDB extends EntityPathBase<TestDB> {

    private static final long serialVersionUID = 1734034605L;

    public static final QTestDB testDB = new QTestDB("testDB");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> pw = createNumber("pw", Integer.class);

    public QTestDB(String variable) {
        super(TestDB.class, forVariable(variable));
    }

    public QTestDB(Path<? extends TestDB> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTestDB(PathMetadata metadata) {
        super(TestDB.class, metadata);
    }

}

