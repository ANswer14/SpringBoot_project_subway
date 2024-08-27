import json

# JSON 파일 경로
file_path = 'C:\\Users\\sdedu\\Desktop\\chat_log\\json\\2024_08_27_chatlog.json'

# 작성할 txt 파일 경로
# C:\\Users\\sdedu\\Desktop\\chat_log\\2024_08
# 2024_08_26_chatlog.txt 형식으로 통일
txt_path = 'C:\\Users\\sdedu\\Desktop\\chat_log\\2024_08\\2024_08_27_chatlog.txt';


# 파일 열기 및 JSON 데이터 읽기
with open(file_path, 'r', encoding='UTF8') as file:
    data = json.load(file)

# JSON 데이터 출력
# print(data['messages'][0]['content'])

with open(txt_path, 'w', encoding='UTF8') as target:
    for a in data['messages']:
        target.write("{0} : {1}\n".format(a['author']['nickname'], a['content']));

print('{0}작업 완료\n'.format(txt_path));

