import gym
import time

env=gym.make("BreakoutDeterministic-v4", render_mode="human")
action=0
obs=env.reset()
while True:
    env.render()
    state, reward, done, _,i= env.step(action)
    if done:
        env.reset()
        break
time.sleep(1)
env.close

# import cv2
# import gym
# import time
# import numpy as np
# #env=gym.make("BreakoutDeterministic-v4")
# #env=gym.make("BreakoutDeterministic-v4", render_mode="human")
# env=gym.make("BreakoutNoFrameskip-v4", render_mode="human")
#
# action=0
# obs=env.reset()
# while True:
#     #env.render() #render() 는 디폴드가  "human"으로 설정
#     #action = env.action_space.sample()
#     #action=2
#     state, reward, done, i,_=env.step(action)
#     #shape=(210,160)# 세로, 가로
#     action=0
#     shape=(480,480)
#     print(type(state))
#     print(state.shape)
#     print(state)
#     img=cv2.resize(state,shape,interpolation=cv2.INTER_CUBIC)
#     cv2.imshow('Frame', img)
#
#     frame=img.astype(np.uint8)
#     img2=cv2.cvtColor(frame, cv2.COLOR_RGB2GRAY)
#     img2=cv2.resize(state,shape,interpolation=cv2.INTER_NEAREST)
#     cv2.imshow('grey',img2)
#
#     key_code=cv2.waitKey(10)
#     if key_code==ord('a') or key_code==ord('A'):
#         print("A key pressed")
#         action=3
#     elif key_code==ord('s') or key_code==ord('S'):
#         print("S key pressed")
#         action=1
#     elif key_code==ord('d') or key_code==ord('D'):
#         print("D key pressed")
#         action=2
#     print(key_code)
#     if done:
#         env.reset()
#         break
#     if key_code & 0xFF ==27:      # KEY 27번은 ESC
#         break
#
# time.sleep(1)
# env.close()
#
