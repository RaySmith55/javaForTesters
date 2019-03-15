package com.tutorialspoint.examples.codeWars;

import org.junit.Test;
import static org.junit.Assert.*;

public class alternatingSplitEncryptionTests {

        @Test
        public void testEncrypt() {
            // assertEquals("expected", "actual");
            assertEquals("This is a test!", alternatingSplitEncryption.encrypt("This is a test!", 0));
            assertEquals("hsi  etTi sats!", alternatingSplitEncryption.encrypt("This is a test!", 1));
            assertEquals("s eT ashi tist!", alternatingSplitEncryption.encrypt("This is a test!", 2));
            assertEquals(" Tah itse sits!", alternatingSplitEncryption.encrypt("This is a test!", 3));
            assertEquals("This is a test!", alternatingSplitEncryption.encrypt("This is a test!", 4));
            assertEquals("This is a test!", alternatingSplitEncryption.encrypt("This is a test!", -1));
            assertEquals("hskt svr neetn!Ti aai eyitrsig", alternatingSplitEncryption.encrypt("This alternatingSplitEncryption is very interesting!", 1));
        }

        @Test
        public void testDecrypt() {
            // assertEquals("expected", "actual");
            assertEquals("This is a test!", alternatingSplitEncryption.decrypt("This is a test!", 0));
            assertEquals("This is a test!", alternatingSplitEncryption.decrypt("hsi  etTi sats!", 1));
            assertEquals("This is a test!", alternatingSplitEncryption.decrypt("s eT ashi tist!", 2));
            assertEquals("This is a test!", alternatingSplitEncryption.decrypt(" Tah itse sits!", 3));
            assertEquals("This is a test!", alternatingSplitEncryption.decrypt("This is a test!", 4));
            assertEquals("This is a test!", alternatingSplitEncryption.decrypt("This is a test!", -1));
            assertEquals("This alternatingSplitEncryption is very interesting!", alternatingSplitEncryption.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
        }

        @Test
        public void testNullOrEmpty() {
            // assertEquals("expected", "actual");
            assertEquals("", alternatingSplitEncryption.encrypt("", 0));
            assertEquals("", alternatingSplitEncryption.decrypt("", 0));
            assertEquals(null, alternatingSplitEncryption.encrypt(null, 0));
            assertEquals(null, alternatingSplitEncryption.decrypt(null, 0));
        }
    }
}
