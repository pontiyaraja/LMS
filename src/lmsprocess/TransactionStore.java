package lmsprocess;

import java.util.HashMap;
import java.util.Map;

public class TransactionStore {
	public static Map<String, TransactionModel> transactionStoreMap = new HashMap<>();

	public static Map<String, TransactionModel> getTransactionStoreMap() {
		return transactionStoreMap;
	}

	public static void setTransactionStoreMap(Map<String, TransactionModel> transactionStoreMap) {
		TransactionStore.transactionStoreMap = transactionStoreMap;
	}

	@Override
	public String toString() {
		return "TransactionStore [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
