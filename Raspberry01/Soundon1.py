import RPi.GPIO as GPIO
import time

buzzer_pin=18

GPIO.setmode(GPIO.BCM)

GPIO.setup(buzzer_pin, GPIO.OUT)

pwm=GPIO.PWM(buzzer_pin, 1.0)
pwm.start(50.0)

melody= [330,262,262,392,392,330,294,262,440,262,294,294,262,494]

for note in range(0,8):
    pwm.ChangeFrequency(melody[note])
    time.sleep(0.5)


pwm.ChangeDutyCycle(0.0)

pwm.stop()
GPIO.cleanup()
