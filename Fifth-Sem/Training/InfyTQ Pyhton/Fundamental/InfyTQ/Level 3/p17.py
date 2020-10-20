#PF-Prac-17
train_list=[
{"train_no":16453,"name":"Prasanti Express","from":"SBC","to":"BBS","days_of_run":['Mo','We','Th'],"sleeper_fare":600,"ac_fare": 987},
{"train_no":25627,"name":"Karnataka Express","from":"SBC","to":"DEC","days_of_run":['Su','Tu'],"sleeper_fare":1600,"ac_fare": 2500},
{"train_no":22642,"name":"Trivandrum SF Express","from":"VSKP","to":"TVM","days_of_run":['Mo','Tu','We','Th','Fr','Sa'],"sleeper_fare":800,"ac_fare": 1256},
{"train_no":22905,"name":"Okha Howrah Express","from":"ST","to":"KOAA","days_of_run":['We','Sa'],"sleeper_fare":987,"ac_fare": 2879}]

def get_train_name (train_no):
    #start writing your code here
    for i in range(4):
        if train_list[i]["train_no"] == train_no:
            return train_list[i]
    return "Invalid Train_no"

def get_trains_for_day(day_of_run):
    #start writing your code here
    day_train = []
    for i in range(4):
        if day_of_run in train_list[i]["days_of_run"]:
            day_train.append(train_list[i]["train_no"])
    return day_train if day_train else "Invalid day"


def get_total_fare(train_no,passenger_dict):
    #start writing your code here
    for i in range(4):
        if train_list[i]["train_no"] == train_no:
            return passenger_dict["sleeper"] * train_list[i]["sleeper_fare"] + passenger_dict["ac"] * train_list[i]["ac_fare"]
    return 0

print(get_train_name(25627))
print(get_trains_for_day("Mo"))
print(get_total_fare(22642,{"sleeper":5, "ac":1}))
