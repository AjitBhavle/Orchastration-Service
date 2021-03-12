db.createCollection("account", {
validator:{ $jsonSchema:
				{
				bsonType: "object",
				properties:{
						id:{bsonType: "int"},
						acctId:{bsonType: "string"},
						acctName:{bsonType: "string"},		
					
				bankDetails:{
						bsonType: "object",
						properties:{
							bankId:{bsonType: "string"},
							bankName:{bsonType: "string"},
							IFSC:{bsonType: "string"},
							branchCode: {bsonType: "string"},
						}
					},	
				contacts:{
						bsonType: "object",
						properties:{
							contactNumber:{bsonType: "string"},
							email:{bsonType: "string"},
						}
					},	
				address:{
						bsonType: "object",
						properties:{
							addressLine1:{bsonType: "string"},
							addressLine2:{bsonType: "string"},
							landmark:{bsonType: "string"},
							city: {bsonType: "string"},
							state:{bsonType: "string"},
							country:{bsonType: "string"},
							zip: {bsonType: "int"},
						}
					},
				amount:{bsonType: "double"},
				accountType:{bsonType: "string"},
				audit:{
						bsonType: "object",
						properties:{
						
							createdBy:{bsonType: "string"},
							createdDate:{bsonType: "string"},
							modifiedBy:{bsonType: "string"},
							modifiedDate: {bsonType: "string"},
						}
					}
				}
			}
		}	
});

db.account.createIndex({acctId : 1})

  
  