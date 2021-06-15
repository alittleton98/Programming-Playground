#R file for the statistical analysis of the csv file
irisdataset = read.csv("D:/Users/Mordecai/Dev/Programming-Playground/Machine Learning Samples/Iris Flower Classification/Dataset/iris.csv", header = FALSE)
pythonalgorithmresults = read.csv("D:/Users/Mordecai/Dev/Programming-Playground/Machine Learning Samples/Iris Flower Classification/pythonalgorithmresults.csv", header = FALSE)

colnames(irisdataset) <- c("SepalLength", "SepalWidth", "PetalLength", "PetalWidth", "Class")
glimpse(irisdataset)

# Will need to find solution that applies row names to column names and transposes the data
# Lines 10 and 11 suffice for the time being
pythonalgoresults.with.rownames <- data.frame(pythonalgorithmresults[,-1], row.names=pythonalgorithmresults[,1])
pythonalgoresults.with.rownames = t(pythonalgoresults.with.rownames)

#Scatter plot
plot(SepalLength~SepalWidth, data = irisdataset)

#Finds least squares coefficients
fit.iris = lm(SepalLength~SepalWidth, data = irisdataset)
summary(fit.iris)


#Box Plot
sepalLengthBP <- irisdataset$SepalLength
sepalWidthBP <- irisdataset$SepalWidth
petalLengthBP <- irisdataset$PetalLength
petalWidthBP <- irisdataset$PetalWidth
boxplot(sepalLengthBP, sepalWidthBP, petalLengthBP, petalWidthBP)

#Histograms
hist(sepalLengthBP)
hist(sepalWidthBP)
hist(petalLengthBP)
hist(petalWidthBP)

#Scatter

scatter.smooth(sepalLengthBP)
scatter.smooth(sepalLengthBP, petalLengthBP)

pairs(irisdataset[,1:4], pch = 19)


boxplot(par_transpose)
