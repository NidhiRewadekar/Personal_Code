sentence="What is the Airspeed Velocity of an Unladen Swallow Today Cause I Want To Know About It"
split_sentence=sentence.split()
result={word:len(word) for word in split_sentence}
print(result)
