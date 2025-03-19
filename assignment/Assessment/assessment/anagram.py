def check_anagram(data1, data2):
    data1 = data1.lower()
    data2 = data2.lower()
    if sorted(data1) != sorted(data2):
        return False
    return all(data1[number] != data2[i] for number in range(len(data1)))


def Vowel(char):
    
    if char == 'a' or 'e' or 'i' or 'o' or 'u' or 'A' or 'E' or 'I' or 'O' or 'U':
        return True
    else:
        return False


def find_longest_word(words_list):  
    word_len = []  

    for number in words_list:  
        word_len.append((len(number), number)) 
 
    word_len.sort()  
    return word_len[-1][1]  
