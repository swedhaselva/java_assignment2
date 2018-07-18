package com.practice.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.practice.Filecontent;

public class Filecontenttest {
    


	
    @Test
    public void testNewfiles() {
        
            File folder1 = new File("/home/swedha/Desktop/hi/");
            assertEquals("hello world",Filecontent.listFilesForFolder(folder1));

        }
    }