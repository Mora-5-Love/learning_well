package tree;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class Merkle_tree {
    //transaction list
    private List<String> txlist ;
    //Merkle root
    private String root;


    /**
     * constructor
     */

    public Merkle_tree(List list){
        this.txlist = list;
        root="";
    }

    public void merkle_tree(){
        List<String> temp_tx_list = new ArrayList<>();
        for (int i = 0; i < this.txlist.size(); i++) {
            temp_tx_list.add(this.txlist.get(i));
        }

        List<String> new_tx_list = get_new_txlist(temp_tx_list);

        while (new_tx_list.size()!=1){
            new_tx_list = get_new_txlist(new_tx_list);
        }

        this.root = new_tx_list.get(0);

    }

    private List<String> get_new_txlist(List<String> temp_tx_list) {

        List<String> new_tx_list = new ArrayList<>();
        int index = 0;
        while (index<temp_tx_list.size()){
            String left = temp_tx_list.get(index);
            index++;
            String right = "";
            if(index != temp_tx_list.size()){
                right = temp_tx_list.get(index);
            }

            String sha2_hex_value = get_sha2_hex_value(left+right);
            new_tx_list.add(sha2_hex_value);
            index++;
        }
        return new_tx_list;
    }

    private String get_sha2_hex_value(String str) {
        byte[] cipher_byte;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(str.getBytes());
            cipher_byte = md.digest();
            StringBuilder sBuilder = new StringBuilder(2* cipher_byte.length);
            for (byte b : cipher_byte
                 ) {
                sBuilder.append(String.format("%02x",b&0xff));
            }
            return sBuilder.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    public List getTxlist() {
        return txlist;
    }

    public void setTxlist(List txlist) {
        this.txlist = txlist;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }
}
